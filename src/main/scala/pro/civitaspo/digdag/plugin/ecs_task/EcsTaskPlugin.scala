package pro.civitaspo.digdag.plugin.ecs_task

import java.util.{Arrays => JArrays, List => JList}

import io.digdag.client.config.Config
import io.digdag.spi.{OperatorFactory, OperatorProvider, Plugin, TemplateEngine}
import javax.inject.Inject
import pro.civitaspo.digdag.plugin.ecs_task.command.EcsTaskCommandResultInternalOperatorFactory
import pro.civitaspo.digdag.plugin.ecs_task.embulk.EcsTaskEmbulkOperatorFactory
import pro.civitaspo.digdag.plugin.ecs_task.py.EcsTaskPyOperatorFactory
import pro.civitaspo.digdag.plugin.ecs_task.rb.EcsTaskRbOperatorFactory
import pro.civitaspo.digdag.plugin.ecs_task.register.EcsTaskRegisterOperatorFactory
import pro.civitaspo.digdag.plugin.ecs_task.result.EcsTaskResultOperatorFactory
import pro.civitaspo.digdag.plugin.ecs_task.run.{EcsTaskRunInternalOperatorFactory, EcsTaskRunOperatorFactory}
import pro.civitaspo.digdag.plugin.ecs_task.sh.EcsTaskShOperatorFactory
import pro.civitaspo.digdag.plugin.ecs_task.wait.EcsTaskWaitOperatorFactory

object EcsTaskPlugin {

  class EcsTaskOperatorProvider extends OperatorProvider {

    @Inject protected var systemConfig: Config = null
    @Inject protected var templateEngine: TemplateEngine = null

    override def get(): JList[OperatorFactory] = {
      JArrays.asList(
        EcsTaskCommandResultInternalOperatorFactory(systemConfig, templateEngine),
        EcsTaskEmbulkOperatorFactory(systemConfig, templateEngine),
        EcsTaskPyOperatorFactory(systemConfig, templateEngine),
        EcsTaskRbOperatorFactory(systemConfig, templateEngine),
        EcsTaskRegisterOperatorFactory(systemConfig, templateEngine),
        EcsTaskResultOperatorFactory(systemConfig, templateEngine),
        EcsTaskRunOperatorFactory(systemConfig, templateEngine),
        EcsTaskRunInternalOperatorFactory(systemConfig, templateEngine),
        EcsTaskShOperatorFactory(systemConfig, templateEngine),
        EcsTaskWaitOperatorFactory(systemConfig, templateEngine)
      )
    }
  }
}

class EcsTaskPlugin extends Plugin {
  override def getServiceProvider[T](`type`: Class[T]): Class[_ <: T] = {
    if (`type` ne classOf[OperatorProvider]) return null
    classOf[EcsTaskPlugin.EcsTaskOperatorProvider].asSubclass(`type`)
  }
}

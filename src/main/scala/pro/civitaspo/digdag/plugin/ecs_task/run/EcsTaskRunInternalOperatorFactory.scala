package pro.civitaspo.digdag.plugin.ecs_task.run
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskRunInternalOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.run_internal"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskRunInternalOperator(getType, context, systemConfig, templateEngine)
}

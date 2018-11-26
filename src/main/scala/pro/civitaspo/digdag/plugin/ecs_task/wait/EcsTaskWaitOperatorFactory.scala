package pro.civitaspo.digdag.plugin.ecs_task.wait
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskWaitOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.wait"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskWaitOperator(getType, context, systemConfig, templateEngine)
}

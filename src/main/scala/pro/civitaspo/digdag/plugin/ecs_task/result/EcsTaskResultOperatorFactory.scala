package pro.civitaspo.digdag.plugin.ecs_task.result
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskResultOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.result"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskResultOperator(getType, context, systemConfig, templateEngine)
}

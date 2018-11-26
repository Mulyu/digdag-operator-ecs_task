package pro.civitaspo.digdag.plugin.ecs_task.register
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskRegisterOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.register"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskRegisterOperator(getType, context, systemConfig, templateEngine)
}

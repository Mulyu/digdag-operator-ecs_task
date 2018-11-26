package pro.civitaspo.digdag.plugin.ecs_task.command
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskCommandResultInternalOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.command_result_internal"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskCommandResultInternalOperator(getType, context, systemConfig, templateEngine)
}

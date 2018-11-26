package pro.civitaspo.digdag.plugin.ecs_task.embulk
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskEmbulkOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.embulk"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskEmbulkOperator(getType, context, systemConfig, templateEngine)
}

package pro.civitaspo.digdag.plugin.ecs_task.run
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskRunOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.run"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskRunOperator(getType, context, systemConfig, templateEngine)
}

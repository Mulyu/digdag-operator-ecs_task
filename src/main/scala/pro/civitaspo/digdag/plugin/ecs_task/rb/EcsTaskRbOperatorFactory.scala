package pro.civitaspo.digdag.plugin.ecs_task.rb
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskRbOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.rb"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskRbOperator(getType, context, systemConfig, templateEngine)
}

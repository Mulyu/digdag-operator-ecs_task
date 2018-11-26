package pro.civitaspo.digdag.plugin.ecs_task.sh
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskShOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.sh"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskShOperotar(getType, context, systemConfig, templateEngine)
}

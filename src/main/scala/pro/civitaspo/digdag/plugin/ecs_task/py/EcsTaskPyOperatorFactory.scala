package pro.civitaspo.digdag.plugin.ecs_task.py
import io.digdag.client.config.Config
import io.digdag.spi.{Operator, OperatorContext, OperatorFactory, TemplateEngine}

case class EcsTaskPyOperatorFactory(systemConfig: Config, templateEngine: TemplateEngine) extends OperatorFactory {
  override def getType: String = "ecs_task.py"
  override def newOperator(context: OperatorContext): Operator = new EcsTaskPyOperator(getType, context, systemConfig, templateEngine)
}

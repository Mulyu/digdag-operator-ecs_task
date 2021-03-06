package pro.civitaspo.digdag.plugin.ecs_task.util

object TryWithResource {

  def apply[A <: { def close() }, B](resource: A)(f: A => B): B = {
    try f(resource)
    finally resource.close()
  }

}

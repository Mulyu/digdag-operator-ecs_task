0.0.8 (2018-12-14)
==================
* [Enhancement] Retry scripting operator when the container exit without exit code.
* [Enhancement] Strip the line end of command for redirecting operation in `run.sh`.

0.0.7 (2018-11-19)
==================

* [Enhancement] Add examples for scripting operators and update `ecs_task.run>` example.
* [Enhancement] Always normalize ECS Task family name.
* [Enhancement] Update aws-java-sdk 1.11.433 -> 1.11.451
* [Enhancement] Add new options (`secrets`, `tags`) that follow ECS new release. `ipc_mode` and `pid_mode` are not supported yet because aws-java-sdk does not supports them.

0.0.6 (2018-11-13)
==================

* [Enhancement] Enable to use params as env for `ecs_task.sh`

0.0.5 (2018-11-13)
==================

* [Experimental] Implement `ecs_task.rb>` operator.
* [Experimental] Implement `ecs_task.sh>` operator.
* [Enhancement] Add interface for another storage except S3 used by scripting operators.
* [Enhancement] Add abstract class for scripting operators.
* [Enhancement] Request ECS TaskRun with some retry.
* [Fix] Prevent the influence of prior task registration.
* [Enhancement] Add Logging for registered TaskDefinition arn. 
* [Enhancement] Define VERSION var as package object val.

0.0.4 (2018-11-06)
==================

* [Experimental] Implement `ecs_task.embulk>` operator.
* [Enhancement] Write README for scripting operators.
* [Enhancement] Make family name more configuable for scripting operators.

0.0.3 (2018-10-30)
==================

* [Breaking Change] Do not use enum parameter directory because the enums require upper camel case ( `ecs_task.{py,register,run}>` operator)
* [Enhancement] Rename the configuration key: `additional_containers` to `sidecars` ( `ecs_task.py>` operator)
* [Breaking Change/Enhancement] Rename the configuration key: `environment` to `environments` ( `ecs_task.{py,register,run}>` operator)
* [Enhancement] Rename the output key: `last_ecs_task_py` to `last_ecs_task_command` ( `ecs_task.py>` operator)
* [Fix] Fix example indents
* [Fix] Avoid java.nio.charset.MalformedInputException: Input length = 1
* [Fix] Avoid com.amazonaws.services.ecs.model.ClientException: Family contains invalid characters when the default value is used.
* [Enhancement] Enable to parse json text in configuration
* [Enhancement] Get s3 content more simply
* [Fix] Use unique s3 workspace path
* [Fix] print error in runner.py

0.0.2 (2018-10-29)
==================

* [Experimental] Implement `ecs_task.py>` operator. (No document yet)
* [Fix] Stop correctly after task run to shutdown TransferManager after processing.

0.0.1 (2018-10-23)
==================

* First Release

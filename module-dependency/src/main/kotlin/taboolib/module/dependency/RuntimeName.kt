package taboolib.module.dependency

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@kotlin.annotation.Repeatable
annotation class RuntimeName(val group: String, val name: String)
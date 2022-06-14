load("@bazel_tools//tools/jdk:default_java_toolchain.bzl", "default_java_toolchain")
load("@io_bazel_rules_kotlin//kotlin:core.bzl", "define_kt_toolchain")
load("@io_bazel_rules_scala//scala:scala_toolchain.bzl", "scala_toolchain")
load("@rules_java//java:defs.bzl", "java_library", "java_package_configuration", "java_plugin")

default_java_toolchain(
    name = "toolchain_java17",
    configuration = dict(),
    java_runtime = "@bazel_tools//tools/jdk:remotejdk_17",
    package_configuration = [
        ":src_package_configuration",
        ":external_package_configuration",
    ],
    source_version = "17",
    target_version = "17",
    visibility = ["//visibility:public"],
    xlint = [
        "all",
        "-processing",
        "-classfile",
    ],
)

JAVACOPTS = [
    "-Xpkginfo:nonempty",
    "-XepExcludedPaths:.*/_javac/.*",
    "-XepDisableWarningsInGeneratedCode",
    "-XepAllDisabledChecksAsWarnings",
    "-Xep:Java7ApiChecker:OFF",
    "-Xep:Java8ApiChecker:OFF",
    "-Xep:AndroidJdkLibsChecker:OFF",
    "-Xep:StaticOrDefaultInterfaceMethod:OFF",
    "-Xep:NoFunctionalReturnType:OFF",
    "-Xep:WildcardImport:OFF",
    "-Xep:ReturnMissingNullable:OFF",
    "-Xep:AnnotationPosition:OFF",
    "-XepOpt:NullAway:AnnotatedPackages=com.fillmore_labs",
    "-XepOpt:NullAway:CheckOptionalEmptiness=true",
    "-XepOpt:NullAway:HandleTestAssertionLibraries=true",
]

java_package_configuration(
    name = "src_package_configuration",
    javacopts = JAVACOPTS + ["-Werror"],
    packages = [":src_package_group"],
)

package_group(
    name = "src_package_group",
    packages = [
        "//src/...",
    ],
)

java_package_configuration(
    name = "external_package_configuration",
    javacopts = ["-Xlint:none"],
    packages = [":external_package_group"],
)

package_group(
    name = "external_package_group",
    packages = [
        "-//src/...",
        "//...",
    ],
)

scala_toolchain(
    name = "toolchain_scala213",
    scalacopts = ["-Xsource:3"],
    unused_dependency_checker_mode = "warn",
    visibility = ["//visibility:public"],
)

toolchain(
    name = "scala213_toolchain",
    toolchain = "toolchain_scala213",
    toolchain_type = "@io_bazel_rules_scala//scala:toolchain_type",
    visibility = ["//visibility:public"],
)

define_kt_toolchain(
    name = "kotlin_toolchain",
    api_version = "1.7",
    jvm_target = "17",
    language_version = "1.7",
)

# ---
# https://github.com/uber/NullAway/wiki

java_plugin(
    name = "nullaway_processor",
    deps = ["@maven//:com_uber_nullaway_nullaway"],
)

java_library(
    name = "nullaway",
    exported_plugins = ["nullaway_processor"],
    neverlink = True,
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:com_google_errorprone_error_prone_annotations",
        "@maven//:com_uber_nullaway_nullaway",
        "@maven//:org_checkerframework_checker_qual",
    ],
)

# ---
# https://github.com/google/auto/blob/master/value/userguide/index.md

java_plugin(
    name = "auto_value_processor",
    processor_class = "com.google.auto.value.processor.AutoValueProcessor",
    deps = ["@maven//:com_google_auto_value_auto_value"],
)

java_plugin(
    name = "auto_builder_processor",
    processor_class = "com.google.auto.value.processor.AutoBuilderProcessor",
    deps = ["@maven//:com_google_auto_value_auto_value"],
)

java_plugin(
    name = "auto_oneof_processor",
    processor_class = "com.google.auto.value.processor.AutoOneOfProcessor",
    deps = ["@maven//:com_google_auto_value_auto_value"],
)

java_plugin(
    name = "auto_annotation_processor",
    processor_class = "com.google.auto.value.processor.AutoAnnotationProcessor",
    deps = ["@maven//:com_google_auto_value_auto_value"],
)

java_library(
    name = "autovalue",
    exported_plugins = [
        "auto_value_processor",
        "auto_builder_processor",
        "auto_oneof_processor",
        "auto_annotation_processor",
    ],
    neverlink = True,
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:com_google_auto_value_auto_value_annotations",
    ],
)

# ---
# https://freebuilder.inferred.org

java_plugin(
    name = "freebuilder_processor",
    generates_api = True,
    processor_class = "org.inferred.freebuilder.processor.Processor",
    deps = ["@maven//:org_inferred_freebuilder"],
)

java_library(
    name = "freebuilder",
    exported_plugins = ["freebuilder_processor"],
    neverlink = True,
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:org_inferred_freebuilder",
    ],
)

# ---
# https://immutables.github.io

java_plugin(
    name = "immutables_processor",
    generates_api = True,
    processor_class = "org.immutables.value.processor.Processor",
    deps = ["@maven//:org_immutables_value_processor"],
)

java_library(
    name = "immutables",
    exported_plugins = ["immutables_processor"],
    neverlink = True,
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:org_immutables_value_annotations",
    ],
)

# ---
# https://projectlombok.org/features/all

java_plugin(
    name = "lombok_processor",
    generates_api = True,
    processor_class = "lombok.launch.AnnotationProcessorHider$AnnotationProcessor",
    deps = ["@maven//:org_projectlombok_lombok"],
)

java_library(
    name = "lombok",
    data = [
        "//:lombok.config",
    ],
    exported_plugins = ["lombok_processor"],
    neverlink = True,
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:org_projectlombok_lombok",
    ],
)

# ---
# https://truth.dev

java_library(
    name = "truth",
    testonly = True,
    visibility = ["//visibility:public"],
    exports = [
        "@maven//:com_google_truth_extensions_truth_java8_extension",
        "@maven//:com_google_truth_truth",
        "@maven//:junit_junit",
    ],
)

workspace(name = "com_fillmore_labs_value_comparison")

register_toolchains("//toolchain:toolchain_java17_definition")

register_toolchains("//toolchain:scala213_toolchain")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "bazel_skylib",
    sha256 = "66ffd9315665bfaafc96b52278f57c7e2dd09f5ede279ea6d39b2be471e7e3aa",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.4.2/bazel-skylib-1.4.2.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.4.2/bazel-skylib-1.4.2.tar.gz",
    ],
)

http_archive(
    name = "io_bazel_rules_go",
    sha256 = "6b65cb7917b4d1709f9410ffe00ecf3e160edf674b78c54a894471320862184f",
    urls = [
        "https://github.com/bazelbuild/rules_go/releases/download/v0.41.0/rules_go-v0.39.0.zip",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.39.0/rules_go-v0.39.0.zip",
    ],
)

http_archive(
    name = "bazel_gazelle",
    sha256 = "29218f8e0cebe583643cbf93cae6f971be8a2484cdcfa1e45057658df8d54002",
    urls = [
        "https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.32.0/bazel-gazelle-v0.32.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-gazelle/releases/download/v0.32.0/bazel-gazelle-v0.32.0.tar.gz",
    ],
)

http_archive(
    name = "rules_pkg",
    sha256 = "8f9ee2dc10c1ae514ee599a8b42ed99fa262b757058f65ad3c384289ff70c4b8",
    urls = [
        "https://github.com/bazelbuild/rules_pkg/releases/download/0.9.1/rules_pkg-0.9.1.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_pkg/releases/download/0.9.1/rules_pkg-0.9.1.tar.gz",
    ],
)

http_archive(
    name = "rules_proto",
    sha256 = "dc3fb206a2cb3441b485eb1e423165b231235a1ea9b031b4433cf7bc1fa460dd",
    strip_prefix = "rules_proto-5.3.0-21.7",
    url = "https://github.com/bazelbuild/rules_proto/archive/refs/tags/5.3.0-21.7.tar.gz",
)

http_archive(
    name = "com_google_protobuf",
    sha256 = "a700a49470d301f1190a487a923b5095bf60f08f4ae4cac9f5f7c36883d17971",
    strip_prefix = "protobuf-23.4",
    url = "https://github.com/protocolbuffers/protobuf/archive/refs/tags/v23.4.tar.gz",
)

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "977a0bd4593c8d4c8f45e056d181c35e48aa01ad4f8090bdb84f78dca42f47dc",
    strip_prefix = "buildtools-6.1.2",
    url = "https://github.com/bazelbuild/buildtools/archive/refs/tags/v6.1.2.tar.gz",
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "d31e369b854322ca5098ea12c69d7175ded971435e55c18dd9dd5f29cc5249ac",
    strip_prefix = "rules_jvm_external-5.3",
    url = "https://github.com/bazelbuild/rules_jvm_external/releases/download/5.3/rules_jvm_external-5.3.tar.gz",
)

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "6a423ab3ffa94f173e26421ebc93efc3bea239b057248886b70fb9e1914267c4",
    strip_prefix = "rules_scala-20210201",
    url = "https://github.com/bazelbuild/rules_scala/archive/refs/tags/v20210201.tar.gz",
)

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = "01293740a16e474669aba5b5a1fe3d368de5832442f164e4fbfc566815a8bc3a",
    url = "https://github.com/bazelbuild/rules_kotlin/releases/download/v1.8/rules_kotlin_release.tgz",
)

# ---

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")

bazel_skylib_workspace()

# ---

load("@io_bazel_rules_go//go:deps.bzl", "go_register_toolchains", "go_rules_dependencies")

go_register_toolchains(go_version = "1.20.4")

go_rules_dependencies()

# ---

load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies")

gazelle_dependencies()

# ---

load("@rules_pkg//:deps.bzl", "rules_pkg_dependencies")

rules_pkg_dependencies()

# ---

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

# ---

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")

rules_proto_dependencies()

rules_proto_toolchains()

# ---

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")

scala_config(scala_version = "2.13.10")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories(
    fetch_sources = True,
    overriden_artifacts = {
        "io_bazel_rules_scala_scala_compiler": {
            "artifact": "org.scala-lang:scala-compiler:2.13.10",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
                "@io_bazel_rules_scala_scala_reflect",
            ],
            "sha256": "2cd4a964ea48e78c91a2a7b19c4fc67a9868728ace5ee966b1d498270b3c3aa7",
        },
        "io_bazel_rules_scala_scala_library": {
            "artifact": "org.scala-lang:scala-library:2.13.10",
            "sha256": "e6ca607c3fce03e8fa38af3374ce1f8bb098e316e8bf6f6d27331360feddb1c1",
        },
        "io_bazel_rules_scala_scala_reflect": {
            "artifact": "org.scala-lang:scala-reflect:2.13.10",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
            ],
            "sha256": "62bd7a7198193c5373a992c122990279e413af3307162472a5d3cbb8ecadb35e",
        },
    },
)

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains", "scala_register_unused_deps_toolchains")

scala_register_toolchains()

scala_register_unused_deps_toolchains()

# ---

load("@io_bazel_rules_kotlin//kotlin:repositories.bzl", "kotlin_repositories")

kotlin_repositories()

register_toolchains("//toolchain:kotlin_toolchain")

# ---

load("@rules_jvm_external//:defs.bzl", "maven_install")
load("//toolchain:defs.bzl", "testonly_artifacts")

maven_install(
    artifacts = [
        "com.google.auto.value:auto-value-annotations:1.10.2",
        "com.google.auto.value:auto-value:1.10.2",
        "com.google.errorprone:error_prone_annotations:2.21.1",
        "com.google.flogger:flogger-system-backend:0.7.4",
        "com.google.flogger:flogger:0.7.4",
        "com.google.guava:guava:32.1.2-jre",
        "com.uber.nullaway:nullaway:0.10.12",
        "commons-validator:commons-validator:1.7",
        "org.checkerframework:checker-qual:3.36.0",
        "org.immutables:value-annotations:2.9.3",
        "org.immutables:value-processor:2.9.3",
        "org.inferred:freebuilder:2.8.0",
        "org.projectlombok:lombok:1.18.28",
    ] + testonly_artifacts([
        "com.google.truth.extensions:truth-java8-extension:1.1.3",
        "com.google.truth:truth:1.1.3",
        "junit:junit:4.13.2",
        "nl.jqno.equalsverifier:equalsverifier:3.14.1",
    ]),
    fetch_sources = True,
    maven_install_json = "//:maven_install.json",
    override_targets = {
        "com.google.protobuf:protobuf-java": "@com_google_protobuf//:protobuf_java",
        "com.google.protobuf:protobuf-java-util": "@com_google_protobuf//:protobuf_java_util",
        "org.scala-lang:scala-compiler": "@io_bazel_rules_scala_scala_compiler",
        "org.scala-lang:scala-library": "@io_bazel_rules_scala_scala_library",
        "org.scala-lang:scala-reflect": "@io_bazel_rules_scala_scala_reflect",
    },
    repositories = [
        "https://repo1.maven.org/maven2",
        "https://repo.maven.apache.org/maven2",
        "https://maven-central-eu.storage-download.googleapis.com/maven2",
    ],
)

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()

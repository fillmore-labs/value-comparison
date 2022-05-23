workspace(name = "com_fillmore_labs_value_comparison")

register_toolchains("//toolchain:toolchain_java17_definition")

register_toolchains("//toolchain:scala213_toolchain")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "bazel_skylib",
    sha256 = "f7be3474d42aae265405a592bb7da8e171919d74c16f082a5457840f06054728",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.2.1/bazel-skylib-1.2.1.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.2.1/bazel-skylib-1.2.1.tar.gz",
    ],
)

http_archive(
    name = "rules_java",
    sha256 = "8c376f1e4ab7d7d8b1880e4ef8fc170862be91b7c683af97ca2768df546bb073",
    urls = [
        "https://github.com/bazelbuild/rules_java/releases/download/5.0.0/rules_java-5.0.0.1.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_java/releases/download/5.0.0/rules_java-5.0.0.tar.gz",
    ],
)

http_archive(
    name = "remote_java_tools",
    sha256 = "2eede49b2d80135e0ea22180f63df26db2ed4b795c1c041b25cc653d6019fbec",
    urls = [
        "https://github.com/bazelbuild/java_tools/releases/download/java_v11.7.1/java_tools-v11.7.1.zip",
        "https://mirror.bazel.build/bazel_java_tools/releases/java/v11.7.1/java_tools-v11.7.1.zip",
    ],
)

http_archive(
    name = "remote_java_tools_linux",
    sha256 = "f78077f0c043d0d13c82de0ee4a99753e66bb18ec46e3601fa2a10e7f26798a8",
    urls = [
        "https://github.com/bazelbuild/java_tools/releases/download/java_v11.7.1/java_tools_linux-v11.7.1.zip",
        "https://mirror.bazel.build/bazel_java_tools/releases/java/v11.7.1/java_tools_linux-v11.7.1.zip",
    ],
)

http_archive(
    name = "remote_java_tools_windows",
    sha256 = "a7086734866505292ee4c206328c73c6af127e69bd51b98c9c186ae4b9b6d2db",
    urls = [
        "https://github.com/bazelbuild/java_tools/releases/download/java_v11.7.1/java_tools_windows-v11.7.1.zip",
        "https://mirror.bazel.build/bazel_java_tools/releases/java/v11.7.1/java_tools_windows-v11.7.1.zip",
    ],
)

http_archive(
    name = "remote_java_tools_darwin",
    sha256 = "4d6d388b54ad3b9aa35b30dd67af8d71c4c240df8cfb5000bbec67bdd5c53a73",
    urls = [
        "https://github.com/bazelbuild/java_tools/releases/download/java_v11.7.1/java_tools_darwin-v11.7.1.zip",
        "https://mirror.bazel.build/bazel_java_tools/releases/java/v11.7.1/java_tools_darwin-v11.7.1.zip",
    ],
)

http_archive(
    name = "io_bazel_rules_go",
    sha256 = "ab21448cef298740765f33a7f5acee0607203e4ea321219f2a4c85a6e0fb0a27",
    urls = [
        "https://github.com/bazelbuild/rules_go/releases/download/v0.32.0/rules_go-v0.32.0.zip",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.32.0/rules_go-v0.32.0.zip",
    ],
)

http_archive(
    name = "bazel_gazelle",
    sha256 = "5982e5463f171da99e3bdaeff8c0f48283a7a5f396ec5282910b9e8a49c0dd7e",
    urls = [
        "https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.25.0/bazel-gazelle-v0.25.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-gazelle/releases/download/v0.25.0/bazel-gazelle-v0.25.0.tar.gz",
    ],
)

http_archive(
    name = "rules_pkg",
    sha256 = "8a298e832762eda1830597d64fe7db58178aa84cd5926d76d5b744d6558941c2",
    urls = [
        "https://github.com/bazelbuild/rules_pkg/releases/download/0.7.0/rules_pkg-0.7.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_pkg/releases/download/0.7.0/rules_pkg-0.7.0.tar.gz",
    ],
)

http_archive(
    name = "rules_proto",
    sha256 = "66bfdf8782796239d3875d37e7de19b1d94301e8972b3cbd2446b332429b4df1",
    strip_prefix = "rules_proto-4.0.0",
    url = "https://github.com/bazelbuild/rules_proto/archive/refs/tags/4.0.0.tar.gz",
)

http_archive(
    name = "com_google_protobuf",
    sha256 = "b07772d38ab07e55eca4d50f4b53da2d998bb221575c60a4f81100242d4b4889",
    strip_prefix = "protobuf-3.20.0",
    url = "https://github.com/protocolbuffers/protobuf/archive/refs/tags/v3.20.0.tar.gz",
)

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "e3bb0dc8b0274ea1aca75f1f8c0c835adbe589708ea89bf698069d0790701ea3",
    strip_prefix = "buildtools-5.1.0",
    url = "https://github.com/bazelbuild/buildtools/archive/refs/tags/5.1.0.tar.gz",
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "2cd77de091e5376afaf9cc391c15f093ebd0105192373b334f0a855d89092ad5",
    strip_prefix = "rules_jvm_external-4.2",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.2.tar.gz",
)

http_archive(
    name = "google_bazel_common",
    sha256 = "204507ed64407d51297bb2104c5085285a6ff5f94fe2fca4be940827b46c6bf5",
    strip_prefix = "bazel-common-221ecf2922e8ebdf8e002130e9772045cfa2f464",
    url = "https://github.com/google/bazel-common/archive/221ecf2922e8ebdf8e002130e9772045cfa2f464.tar.gz",
)

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "6e9191363357d30b144e7306fec74deea2c7f1de63f3ed32028838116c239e8a",
    strip_prefix = "rules_scala-4ba3780fcba8d26980daff4639abc6f18517308b",
    url = "https://github.com/bazelbuild/rules_scala/archive/4ba3780fcba8d26980daff4639abc6f18517308b.tar.gz",
)

http_archive(
    name = "io_bazel_rules_kotlin_head",
    sha256 = "50a17db3dd09ab9a158abc5bd5eb9f9a969addf9e79f592edb69724634b0240d",
    strip_prefix = "rules_kotlin-ba80322a82982a23a0ebad0292e81ec77a2893f2",
    url = "https://github.com/bazelbuild/rules_kotlin/archive/ba80322a82982a23a0ebad0292e81ec77a2893f2.tar.gz",
)

# ---

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")

bazel_skylib_workspace()

# ---

load("@rules_java//java:repositories.bzl", "rules_java_dependencies", "rules_java_toolchains")

rules_java_dependencies()

rules_java_toolchains()

# ---

load("@io_bazel_rules_go//go:deps.bzl", "go_register_toolchains", "go_rules_dependencies")

go_register_toolchains(go_version = "1.18.1")

go_rules_dependencies()

# ---

load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies")

gazelle_dependencies()

# ---

load("@rules_pkg//:deps.bzl", "rules_pkg_dependencies")

rules_pkg_dependencies()

# ---

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")

rules_proto_dependencies()

rules_proto_toolchains()

# ---

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

# ---

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")

scala_config(scala_version = "2.13.8")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories(
    fetch_sources = True,
    overriden_artifacts = {
        "io_bazel_rules_scala_scala_compiler": {
            "artifact": "org.scala-lang:scala-compiler:2.13.8",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
                "@io_bazel_rules_scala_scala_reflect",
            ],
            "sha256": "b248cb6f390ee8bceb912af3da471146fdf003702a173d750f986b1d4a3362e6",
        },
        "io_bazel_rules_scala_scala_library": {
            "artifact": "org.scala-lang:scala-library:2.13.8",
            "sha256": "a0882b82514190c2bac7d1a459872a75f005fc0f3e88b2bc0390367146e35db7",
        },
        "io_bazel_rules_scala_scala_reflect": {
            "artifact": "org.scala-lang:scala-reflect:2.13.8",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
            ],
            "sha256": "fdfbcc92e87f424578b303bcb47e0f55fee990c4b6da0006c9e75879d1e442e4",
        },
    },
)

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains", "scala_register_unused_deps_toolchains")

scala_register_toolchains()

scala_register_unused_deps_toolchains()

# ---

load("@io_bazel_rules_kotlin_head//src/main/starlark/release_archive:repository.bzl", "archive_repository")

archive_repository(
    name = "io_bazel_rules_kotlin",
    source_repository_name = "io_bazel_rules_kotlin_head",
)

load("@io_bazel_rules_kotlin//kotlin:repositories.bzl", "kotlin_repositories", "kotlinc_version")

kotlin_repositories(
    compiler_release = kotlinc_version(
        release = "1.6.21",
        # curl -L https://github.com/JetBrains/kotlin/releases/download/v1.6.21/kotlin-compiler-1.6.21.zip | sha256sum
        sha256 = "632166fed89f3f430482f5aa07f2e20b923b72ef688c8f5a7df3aa1502c6d8ba",
    ),
)

kotlin_repositories()

register_toolchains("//toolchain:kotlin_toolchain")

# ---

load("@google_bazel_common//:workspace_defs.bzl", "google_common_workspace_rules")

google_common_workspace_rules()

# ---

load("@rules_jvm_external//:defs.bzl", "maven_install")
load("//toolchain:defs.bzl", "testonly_artifacts")

maven_install(
    artifacts = [
        "com.google.auto.value:auto-value-annotations:1.9",
        "com.google.auto.value:auto-value:1.9",
        "com.google.errorprone:error_prone_annotations:2.13.1",
        "com.google.flogger:flogger-system-backend:0.7.4",
        "com.google.flogger:flogger:0.7.4",
        "com.google.guava:guava:31.1-jre",
        "com.uber.nullaway:nullaway:0.9.6",
        "commons-validator:commons-validator:1.7",
        "org.checkerframework:checker-qual:3.21.4",
        "org.immutables:value-annotations:2.9.0",
        "org.immutables:value-processor:2.9.0",
        "org.inferred:freebuilder:2.7.0",
        "org.projectlombok:lombok:1.18.24",
    ] + testonly_artifacts([
        "com.google.truth.extensions:truth-java8-extension:1.1.3",
        "com.google.truth:truth:1.1.3",
        "junit:junit:4.13.2",
        "nl.jqno.equalsverifier:equalsverifier:3.10",
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

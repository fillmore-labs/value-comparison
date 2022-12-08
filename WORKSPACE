workspace(name = "com_fillmore_labs_value_comparison")

register_toolchains("//toolchain:toolchain_java17_definition")

register_toolchains("//toolchain:scala213_toolchain")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "bazel_skylib",
    sha256 = "74d544d96f4a5bb630d465ca8bbcfe231e3594e5aae57e1edbf17a6eb3ca2506",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.3.0/bazel-skylib-1.3.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.3.0/bazel-skylib-1.3.0.tar.gz",
    ],
)

http_archive(
    name = "rules_java",
    sha256 = "c73336802d0b4882e40770666ad055212df4ea62cfa6edf9cb0f9d29828a0934",
    url = "https://github.com/bazelbuild/rules_java/releases/download/5.3.5/rules_java-5.3.5.tar.gz",
)

http_archive(
    name = "remote_java_tools",
    sha256 = "5cd59ea6bf938a1efc1e11ea562d37b39c82f76781211b7cd941a2346ea8484d",
    urls = [
        "https://github.com/bazelbuild/java_tools/releases/download/java_v11.9/java_tools-v11.9.zip",
        "https://mirror.bazel.build/bazel_java_tools/releases/java/v11.9/java_tools-v11.9.zip",
    ],
)

http_archive(
    name = "remote_java_tools_linux",
    sha256 = "512582cac5b7ea7974a77b0da4581b21f546c9478f206eedf54687eeac035989",
    urls = [
        "https://github.com/bazelbuild/java_tools/releases/download/java_v11.9/java_tools_linux-v11.9.zip",
        "https://mirror.bazel.build/bazel_java_tools/releases/java/v11.9/java_tools_linux-v11.9.zip",
    ],
)

http_archive(
    name = "remote_java_tools_windows",
    sha256 = "677ab910046205020fd715489147c2bcfad8a35d9f5d94fdc998d217545bd87a",
    urls = [
        "https://github.com/bazelbuild/java_tools/releases/download/java_v11.9/java_tools_windows-v11.9.zip",
        "https://mirror.bazel.build/bazel_java_tools/releases/java/v11.9/java_tools_windows-v11.9.zip",
    ],
)

http_archive(
    name = "remote_java_tools_darwin",
    sha256 = "b9e962c6a836ba1d7573f2473fab3a897c6370d4c2724bde4017b40932ff4fe4",
    urls = [
        "https://github.com/bazelbuild/java_tools/releases/download/java_v11.9/java_tools_darwin-v11.9.zip",
        "https://mirror.bazel.build/bazel_java_tools/releases/java/v11.9/java_tools_darwin-v11.9.zip",
    ],
)

http_archive(
    name = "io_bazel_rules_go",
    sha256 = "56d8c5a5c91e1af73eca71a6fab2ced959b67c86d12ba37feedb0a2dfea441a6",
    urls = [
        "https://github.com/bazelbuild/rules_go/releases/download/v0.37.0/rules_go-v0.37.0.zip",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.37.0/rules_go-v0.37.0.zip",
    ],
)

http_archive(
    name = "bazel_gazelle",
    sha256 = "448e37e0dbf61d6fa8f00aaa12d191745e14f07c31cabfa731f0c8e8a4f41b97",
    urls = [
        "https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.28.0/bazel-gazelle-v0.28.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-gazelle/releases/download/v0.28.0/bazel-gazelle-v0.28.0.tar.gz",
    ],
)

http_archive(
    name = "rules_pkg",
    sha256 = "eea0f59c28a9241156a47d7a8e32db9122f3d50b505fae0f33de6ce4d9b61834",
    urls = [
        "https://github.com/bazelbuild/rules_pkg/releases/download/0.8.0/rules_pkg-0.8.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_pkg/releases/download/0.8.0/rules_pkg-0.8.0.tar.gz",
    ],
)

http_archive(
    name = "rules_proto",
    sha256 = "80d3a4ec17354cccc898bfe32118edd934f851b03029d63ef3fc7c8663a7415c",
    strip_prefix = "rules_proto-5.3.0-21.5",
    url = "https://github.com/bazelbuild/rules_proto/archive/refs/tags/5.3.0-21.5.tar.gz",
)

http_archive(
    name = "com_google_protobuf",
    sha256 = "4a7e87e4166c358c63342dddcde6312faee06ea9d5bb4e2fa87d3478076f6639",
    strip_prefix = "protobuf-21.5",
    url = "https://github.com/protocolbuffers/protobuf/archive/refs/tags/v21.5.tar.gz",
)

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "e3bb0dc8b0274ea1aca75f1f8c0c835adbe589708ea89bf698069d0790701ea3",
    strip_prefix = "buildtools-5.1.0",
    url = "https://github.com/bazelbuild/buildtools/archive/refs/tags/5.1.0.tar.gz",
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "6e9f2b94ecb6aa7e7ec4a0fbf882b226ff5257581163e88bf70ae521555ad271",
    strip_prefix = "rules_jvm_external-4.5",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.5.tar.gz",
)

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "d6f3f02eaacc3e4c1ac8edfc10d510efb97e3341ba0377a002c60f195dd9105e",
    strip_prefix = "rules_scala-dee33f45a24bb62f8f0e7cf58665fa40c6159247",
    url = "https://github.com/bazelbuild/rules_scala/archive/dee33f45a24bb62f8f0e7cf58665fa40c6159247.tar.gz",
)

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = "f033fa36f51073eae224f18428d9493966e67c27387728b6be2ebbdae43f140e",
    url = "https://github.com/bazelbuild/rules_kotlin/releases/download/v1.7.0-RC-3/rules_kotlin_release.tgz",
)

# ---

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")

bazel_skylib_workspace()

# ---

load("@io_bazel_rules_go//go:deps.bzl", "go_register_toolchains", "go_rules_dependencies")

go_register_toolchains(go_version = "1.19.4")

go_rules_dependencies()

# ---

load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies")

gazelle_dependencies()

# ---

load("@rules_pkg//:deps.bzl", "rules_pkg_dependencies")

rules_pkg_dependencies()

# ---

load("@rules_java//java:repositories.bzl", "rules_java_dependencies", "rules_java_toolchains")

rules_java_dependencies()

rules_java_toolchains()

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
        "com.google.auto.value:auto-value-annotations:1.10.1",
        "com.google.auto.value:auto-value:1.10.1",
        "com.google.errorprone:error_prone_annotations:2.16",
        "com.google.flogger:flogger-system-backend:0.7.4",
        "com.google.flogger:flogger:0.7.4",
        "com.google.guava:guava:31.1-jre",
        "com.uber.nullaway:nullaway:0.10.5",
        "commons-validator:commons-validator:1.7",
        "org.checkerframework:checker-qual:3.28.0",
        "org.immutables:value-annotations:2.9.2",
        "org.immutables:value-processor:2.9.2",
        "org.inferred:freebuilder:2.8.0",
        "org.projectlombok:lombok:1.18.24",
    ] + testonly_artifacts([
        "com.google.truth.extensions:truth-java8-extension:1.1.3",
        "com.google.truth:truth:1.1.3",
        "junit:junit:4.13.2",
        "nl.jqno.equalsverifier:equalsverifier:3.12.2",
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

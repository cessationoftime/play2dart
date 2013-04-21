// Comment to get more information during initialization
logLevel := Level.Warn

offline := true

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Orcades-LR repository" at "http://www.orcades.net/tmprepo/"

resolvers += Resolver.file("Local Repository", file("/Users/olivier/projects/scala/Play20/repository/local"))(Resolver.ivyStylePatterns)


// Use the Play sbt plugin for Play projects
//addSbtPlugin("play" % "sbt-plugin" % "2.1.1")
addSbtPlugin("play" % "sbt-plugin" % "2.1.0")

addSbtPlugin("net.orcades" % "sbt-dart-plugin" % "0.2.2-SNAPSHOT")

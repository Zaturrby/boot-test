(set-env!
 :source-paths    #{"src/"}
 :dependencies '[[boot/core "2.5.5"]])

(deftask build
  "Build"
  []
  (task-options!
    pom {:project 'hi
         :version "1.0.0"}
    jar {:main 'hi.core}
    aot {:all true})
  (comp (aot)
        (pom)
        (uber)
        (jar)
        (target)))

(deftask dev []
  (comp (watch)
        (build)))
(ns hi.core
  (:require [boot.cli :as cli])
  (:gen-class))

(cli/defclifn -main
  [a awesome bool "true"]
  (println "hello There, My Friend"))

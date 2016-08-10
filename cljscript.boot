#!/usr/bin/env boot

(require '[boot.cli :refer [defclifn]])

(defclifn -main
  [a awesome bool "Whether you want this app to be awesome or not. (Default true)"]
  (println "Named parameters " *opts*)
  (println "List of arguments " *args*))


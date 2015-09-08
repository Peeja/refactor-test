(ns refactor-test.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defmacro troublesome-macro
  "This macro's docstring contains a troublesome ) character."
  []
  "trouble")

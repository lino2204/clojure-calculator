(ns clojure-calculator.core)

(defn add [a b]
  (+ a b))

(defn subtract [a b]
  (- a b))

(defn multiply [a b]
  (* a b))

(defn divide [a b]
  (if (zero? b)
    "Cannot divide by zero"
    (/ a b)))

(defn -main []
  (println "Clojure Calculator"))

(ns clojure-calculator.core-test
  (:require [clojure.test :refer :all]
            [clojure-calculator.core :refer :all]))

(deftest test-add
  (is (= (add 1 2) 3)))

(deftest test-subtract
  (is (= (subtract 5 3) 2)))

(deftest test-multiply
  (is (= (multiply 2 3) 6)))

(deftest test-divide
  (is (= (divide 6 2) 3))
  (is (= (divide 6 0) "Cannot divide by zero")))

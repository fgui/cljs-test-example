Example project with boot to test code written forclojure and clojurescript (cljc).

Run test in clojure and clojurescript.

```
boot watch test-cljs test -n fgui.kata-test
```

Don't understand why when we use a cljc for
test we must specify the namespace to run test in clojure
(not needed in clojurescript).

boot js test environment configured to use slimerjs.org

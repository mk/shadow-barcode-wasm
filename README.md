# Using `barcode-detector-zbar` with shadow-cljs

Resolved this with help from Thomas Heller by keeping the js lib out
of the shadow bundle and using `shadow.esm/dynamic-import` to load it
at runtime.

# Attempt to use `barcode-detector-zbar` with shadow-cljs

Cannot load directly from npm because it doesn't yet support loading of wasm libs.

Works in dev by copying minimized source and wasm to classpath:

```sh
mkdir -p src/barcode-detector-zbar
cp node_modules/barcode-detector-zbar/BarcodeDetectorPolyfill.min.js src/barcode-detector-zbar
cp node_modules/barcode-detector-zbar/zbar.wasm-UORLJJQR.bin public/
```

But breaks using advanced:

``` sh
shadow-cljs release browser && shadow-cljs server
```
with `TypeError: Sa.checkBarcodeDetectorSupport is not a function. (In 'Sa.checkBarcodeDetectorSupport()', 'Sa.checkBarcodeDetectorSupport' is undefined)`

Also `shadow-cljs check browser` ends up erroring with

    ...
    ------ WARNING #28 -  ----------------------------------------------------------
     Resource: shadow.js.shim.module$barcode_detector_zbar$BarcodeDetectorPolyfill_min_js$default.js:2:142
     No properties on this expression
    found   : undefined
    required: Object
    --------------------------------------------------------------------------------
    nil
    Closure compilation failed with 1 errors
    --- barcode-detector-zbar/BarcodeDetectorPolyfill.min.js:1
    Internal compiler error: rewritten module global name module$barcode_detector_zbar$BarcodeDetectorPolyfill_min is already in use.

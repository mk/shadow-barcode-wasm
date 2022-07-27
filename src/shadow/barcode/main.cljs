(ns shadow.barcode.main
  (:require [shadow.esm :refer (dynamic-import)]))
#_#_
(js/console.log "Native api support" (barcode-detector-polyfill/checkBarcodeDetectorSupport))
(barcode-detector-polyfill/setupPolyfill)


(-> (dynamic-import "/barcode-detector-zbar/BarcodeDetectorPolyfill.min.js")
    (.then (fn [mod]
             (js/console.log :mod mod))))


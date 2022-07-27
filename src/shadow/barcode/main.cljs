(ns shadow.barcode.main
  (:require ["/barcode-detector-zbar/BarcodeDetectorPolyfill.min.js$default" :as barcode-detector-polyfill]))

(js/console.log "Native api support" (barcode-detector-polyfill/checkBarcodeDetectorSupport))
(barcode-detector-polyfill/setupPolyfill)


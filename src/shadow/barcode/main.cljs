(ns shadow.barcode.main
  (:require [shadow.esm :refer (dynamic-import)]))

(-> (dynamic-import "/barcode-detector-zbar/BarcodeDetectorPolyfill.min.js")
    (.then (fn [^js mod]
             (let [$default (.-default mod)]
               (js/console.log "native api support:" (.checkBarcodeDetectorSupport $default))
               (.setupPolyfill $default)
               (doto (new $default)
                 (js/console.log))))))


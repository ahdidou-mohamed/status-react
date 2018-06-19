(ns status-im.ui.screens.desktop.main.chat.styles
  (:require [status-im.ui.components.colors :as colors]))

(defn message-box [{:keys [outgoing] :as message}]
  (let [align (if outgoing :flex-end :flex-start)
        color (if outgoing "#dce2fb" "white")]
    {:align-self       align
     :background-color color
     :border-radius    8
     :padding-left     12
     :padding-right    12
     :padding-top      10
     :padding-bottom   10
     :max-width        340}))

(defn message-row [{:keys [outgoing first-in-group?] :as message}]
  (let [padding-horizontal (if outgoing :padding-right :padding-left)
        padding-top-value (if first-in-group? 16 8)]
    {padding-horizontal 24
     :padding-top       padding-top-value}))

(defn message-timestamp-placeholder []
  {:color               "transparent"
   :font-size           10
   :align-self          :flex-end
   :opacity             0.5
   :text-align          :right
   :text-align-vertical :center
   :width               60})

(defn message-timestamp []
  (merge (message-timestamp-placeholder)
         {:color    colors/gray
          :position :absolute
          :bottom   0
          :right    -5}))

(def author
  {:color         colors/gray
   :font-size     12
   :margin-left   48
   :margin-bottom 4})

(def chat-text-input
  {:height            68
   :margin-horizontal 16
   :background-color  :white
   :border-radius     12})

(def messages-view
  {:flex             1
   :background-color "#eef2f5"})

(def photo-style
  {:borderRadius 20
   :width        40
   :height       40
   :margin-right 8  })
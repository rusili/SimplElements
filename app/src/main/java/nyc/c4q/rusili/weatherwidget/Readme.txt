http://www.androidauthority.com/create-simple-android-widget-608975/

App Widget uses RemoteViews which can only use these views:
    FrameLayout, LinearLayout, Relative`Layout, GridLayout
    Button, ImageButton, ImageView, TextView
    ListView, GridView, StackView
    ViewFlipper, AdapterViewFlipper
    AnalogClock, Chronometer, ProgressBar

Size:
Rows/Columns:   n               ex: (3x2)       (4x2)       (5x2)
Size (DP):      70 × n − 30         (180x110)   (250x110)   (320x110)

Layouts: Use match_parent for parent view

Height:
1 Row: 68 dp (No Precipitation/Wind)
2 Rows: 152 dp

Width:
4 Columns: 320 dp
5 Columns: 410 dp


Maximum:
720p = 4 columns
1080p = 5 columns
1440p = 5 columns
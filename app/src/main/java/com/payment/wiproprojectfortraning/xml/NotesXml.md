- # How to create layout folder and files for UI?
-  ## How to create folder?
- - Go to -> res -> new -> new resource folder -> select layout -> then create
- - How to create file?
- ## xml file name convention ?
- - xml file name - small latter_ small latter _.xml -> a_b.xml
- - Create file name - 


# Whats is layout ?
- A layout define the visual structure of a user interface (UI) in an application.
- Arrangement of UI components on the screen. - `View`, `TextView`, `Button`. `EditText`, `ImageView`
# How many type of layout?
- 7 types of layout - `LinearLayout`, `FrameLayout`, `RelativeLayout`, `ConstraintLayout`, `TableLayout`, `GridLayout`, `ScrollView`
# LinearLayout <LinearLayout>  you do any  </LinearLayout>
- Arranges child views either vertically or horizontally.  
- Orientation can be vertical and horizontal
- By default orientation is horizontal
- `<LinearLayout>  you can write code here  </LinearLayout>` 
- gravity - `center`, `start`, `end`, `top`, `bottom`, `center_vertical`, `center_horizontal` // it apply on all child of parent
- layout_gravity - `center`, `start`, `end`, `top`, `bottom`, `center_vertical`, `center_horizontal` -  work along with parent
# RelativeLayout <RelativeLayout> any thing </ReativeLayout>
- Arranges child views in a specific relative position.
- `<RelativeLayout>  you can write code here  </RelativeLayout>`
- gravity - `center`, `start`, `end`, `top`, `bottom`, `center_vertical`, `center_horizontal` // it apply on all child of parent
- layout_gravity - `center`, `start`, `end`, `top`, `bottom`, `center_vertical`, `center_horizontal` -  work along with parent
# FrameLayout <FrameLayout> any thing </FrameLayout>
- FrameLayout - is one of the simplest and most basic ViewGroup in android -
- It is designed to display a single child view but also contains multiple children views.
- Each child overlaps the previous one.
- like Stack
- FrameLayout - Attributes
- android:layout_width - wrap_content, match_parent
- android:layout_height - wrap_content, match_parent
- android:layout_gravity - center, start, end, top, bottom, center_vertical, center_horizontal
- android:layout_margin - top, bottom, start, end
- android:layout_marginStart - start
- android:layout_marginEnd - end
- android:layout_marginTop - top
- android:layout_marginBottom - bottom
- android:padding - top, bottom, start, end
- android:paddingStart - start
- android:paddingEnd - end
- android:paddingTop - top
- android:paddingBottom - bottom
# ConstraintLayout <ConstraintLayout> any thing </ConstraintLayout>

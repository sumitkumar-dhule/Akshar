package com.electrodiligent.core.presentation.picture

interface PictureActions {
    class TapNext() : PictureActions
    class TapPrevious() : PictureActions
    class TapCurrent() : PictureActions

    class Setup() : PictureActions

}

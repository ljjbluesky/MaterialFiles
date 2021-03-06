/*
 * Copyright (c) 2018 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.files.filesystem;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;

public class Documents {

    @NonNull
    public static Intent makeOpenTreeIntent() {
        return new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE);
    }

    public static void takePersistableTreePermission(@NonNull Uri treeUri,
                                                     @NonNull Context context) {
        context.getContentResolver().takePersistableUriPermission(treeUri,
                Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
    }
}

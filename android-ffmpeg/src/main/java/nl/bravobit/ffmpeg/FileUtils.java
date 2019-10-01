package nl.bravobit.ffmpeg;

import android.content.Context;

import androidx.annotation.NonNull;

import java.io.File;

class FileUtils {
    private static final String FFMPEG_FILE_NAME = "lib..ffmpeg..so";

    @NonNull
    static File getFFmpeg(@NonNull Context context) {
        File folder = new File(context.getApplicationInfo().nativeLibraryDir);
        return new File(folder, FFMPEG_FILE_NAME);
    }
}
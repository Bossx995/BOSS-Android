# BOSS Android Cloud Build

A minimal native Android starter project with GitHub Actions automation.

## Build APK using only your phone
1. Extract this ZIP.
2. Create a new GitHub repository named `BOSS-Android-Cloud-Build`.
3. Upload the extracted project files and folders to the repository root (not the ZIP itself). Ensure `.github/workflows/android.yml` is included.
4. Open the repository's **Actions** tab. If prompted, enable workflows.
5. Open **Build BOSS Android APK** and tap **Run workflow** (or push to `main`).
6. When the run finishes, open it and download the `BOSS-debug-APK` artifact. Extract it to get `app-debug.apk`.

## Important
- This is a working starter shell, not a conversion of the uploaded BOSS bot ZIP. Bot code (Node.js/WhatsApp bot) does not automatically become an Android app.
- `minSdk 26` supports Android 8.0 and newer. `targetSdk 35` is the build target; it does not guarantee compatibility with future Android releases.
- The APK is a debug build for testing. A release APK needs signing configuration.

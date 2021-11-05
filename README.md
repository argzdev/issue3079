# Issue 3079
### Prerequisite
- Add google-services.json
- Enable Firebase Realtime Database from Firebase console
### Summary
-  Running the app will immediately cause a crash that will point to endBefore.
-  Crash occurs when a space is used as a parameter in the endBefore() method (e.g. endBefore(" "))

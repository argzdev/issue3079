# Issue 3079
### Prerequisite
#### 1. Add google-services.json
#### 2. enable Firebase Realtime Database from Firebase console
### Summary
#### Running the app will immediately cause a crash that will point to endBefore.
#### Crash occurs when a space is used as a parameter in the endBefore() method (e.g. endBefore(" "))

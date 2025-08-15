# Android-MVP-Architecture

This project demonstrates the traditional implementation of the **Model-View-Presenter (MVP)** architectural pattern in an Android application.

---

## Architecture Overview

**MVP** was one of the most widely used architectural patterns in Android before modern approaches like **MVVM** became popular.  

- **Model** handles business logic and data operations (repositories, APIs, database, etc.).
- **View** is responsible for displaying UI and delegating user actions to the Presenter. *(Implemented by an `Activity`, `Fragment`, or custom View)*.
- **Presenter** acts as the middle layer between the Model and View — it processes input, coordinates with the Model, and updates the View through an interface.

> In this implementation, the Presenter only knows about the **View interface**, not the concrete `Activity`, which makes it loosely coupled and more testable compared to MVC.

---

## Project Structure

- |-- MainActivity // Implements the View layer (IMainActivityView)
- |-- MainActivityPresenter // The Presenter layer (IMainActivityPresenter)
- |-- MainActivityModel // The Model layer


---

## What It Demonstrates

- How UI updates are handled by the Presenter via a View interface.
- How the Presenter interacts with the Model to retrieve or manipulate data.
- The flow of data and events between View, Presenter, and Model in MVP.
- How MVP improves testability and decoupling compared to MVC.

---

## Advantages of This Approach

- **Loose coupling** between View and Presenter (interaction via interface).
- **Better testability** — Presenter can be unit tested without Android framework dependencies.
- **Clear separation of concerns** — View handles UI, Presenter handles logic, Model handles data.

---

## Limitations of This Approach

This project intentionally reflects some drawbacks of MVP, such as:

- **More boilerplate** due to View/Presenter interfaces.
- **Manual lifecycle handling** — Presenter must detach from View to avoid memory leaks.
- **State management** needs to be implemented manually.

These limitations eventually contributed to the adoption of lifecycle-aware architectures like **MVVM** and **MVI**.

---

## Who Is This For?

- Developers learning about the evolution of Android architectures.
- Beginners wanting to understand the fundamentals of MVP before moving to modern patterns.
- Anyone interested in comparing MVP with MVC and MVVM through hands-on examples.

---

## Built With

- Kotlin  
- Android SDK  
- Jetpack Compose





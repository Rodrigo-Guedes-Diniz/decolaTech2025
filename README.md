# DecolaTech 2025

## Diagrama de Classes

```mermaid

classDiagram
    class User {
        - String name
    }

    class Account {
        - String number
        - String agency
        - double balance
        - double limit
    }

    class Feature {
        - String icon
        - String description
    }

    class Card {
        - String number
        - double limit
    }

    class News {
        - String icon
        - String description
    }

    User *-- Account : has
    User *-- Feature : has many
    User *-- Card : has
    User *-- News : has many
```

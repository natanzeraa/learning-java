### Access modifiers rules

|                                | Private | Protected | Public | Default |
|:-------------------------------|:-------:|----------:|-------:|--------:|
| Same class                     |   Yes   |       Yes |    Yes |     Yes |
| Same package as subclass       |   No    |       Yes |    Yes |     Yes |
| Same package non-subclass      |   No    |       Yes |    Yes |     Yes |
| Different package subclass     |   No    |       Yes |    Yes |      No |
| Different package non-subclass |   No    |        No |    Yes |      No |
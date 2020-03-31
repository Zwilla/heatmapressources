export class AbstractNonPersistentEntity {
  static NAME = "dashboard$AbstractNonPersistentEntity";
  id?: any | null;
}
export type AbstractNonPersistentEntityViewName =
  | "_minimal"
  | "_local"
  | "_base";
export type AbstractNonPersistentEntityView<
  V extends AbstractNonPersistentEntityViewName
> = never;

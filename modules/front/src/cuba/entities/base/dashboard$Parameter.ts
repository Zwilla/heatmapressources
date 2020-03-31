import { BaseUuidEntity } from "./sys$BaseUuidEntity";
export class Parameter extends BaseUuidEntity {
  static NAME = "dashboard$Parameter";
  name?: string | null;
  alias?: string | null;
}
export type ParameterViewName = "_minimal" | "_local" | "_base";
export type ParameterView<V extends ParameterViewName> = V extends "_minimal"
  ? Pick<Parameter, "id" | "name">
  : V extends "_base"
  ? Pick<Parameter, "id" | "name">
  : never;

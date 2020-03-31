import { BaseUuidEntity } from "./base/sys$BaseUuidEntity";
export class LayerWrapper extends BaseUuidEntity {
  static NAME = "heatmapressources_LayerWrapper";
  name?: string | null;
  dataContainerId?: string | null;
}
export type LayerWrapperViewName = "_minimal" | "_local" | "_base";
export type LayerWrapperView<
  V extends LayerWrapperViewName
> = V extends "_minimal"
  ? Pick<LayerWrapper, "id" | "name">
  : V extends "_local"
  ? Pick<LayerWrapper, "id" | "name" | "dataContainerId">
  : V extends "_base"
  ? Pick<LayerWrapper, "id" | "name" | "dataContainerId">
  : never;

import { BaseUuidEntity } from "./sys$BaseUuidEntity";
export class DashboardLayout extends BaseUuidEntity {
  static NAME = "dashboard$DashboardLayout";
  children?: DashboardLayout | null;
  parent?: DashboardLayout | null;
  weight?: number | null;
  expand?: any | null;
  styleName?: string | null;
  width?: number | null;
  height?: number | null;
  widthUnit?: any | null;
  heightUnit?: any | null;
  caption?: string | null;
}
export type DashboardLayoutViewName = "_minimal" | "_local" | "_base";
export type DashboardLayoutView<
  V extends DashboardLayoutViewName
> = V extends "_minimal"
  ? Pick<DashboardLayout, "id" | "caption">
  : V extends "_base"
  ? Pick<DashboardLayout, "id" | "caption">
  : never;

import { BaseUuidEntity } from "./sys$BaseUuidEntity";
import { DashboardLayout } from "./dashboard$DashboardLayout";
export class ResponsiveArea extends BaseUuidEntity {
  static NAME = "dashboard$ResponsiveArea";
  component?: DashboardLayout | null;
  order?: number | null;
  xs?: number | null;
  sm?: number | null;
  md?: number | null;
  lg?: number | null;
}
export type ResponsiveAreaViewName = "_minimal" | "_local" | "_base";
export type ResponsiveAreaView<V extends ResponsiveAreaViewName> = never;

import { BaseUuidEntity } from "./sys$BaseUuidEntity";
import { RootLayout } from "./dashboard$RootLayout";
import { Parameter } from "./dashboard$Parameter";
export class Dashboard extends BaseUuidEntity {
  static NAME = "dashboard$Dashboard";
  title?: string | null;
  code?: string | null;
  visualModel?: RootLayout | null;
  parameters?: Parameter | null;
  isAvailableForAllUsers?: boolean | null;
  createdBy?: string | null;
  timerDelay?: number | null;
  assistantBeanName?: string | null;
}
export type DashboardViewName = "_minimal" | "_local" | "_base";
export type DashboardView<V extends DashboardViewName> = V extends "_minimal"
  ? Pick<Dashboard, "id" | "title">
  : V extends "_base"
  ? Pick<Dashboard, "id" | "title">
  : never;

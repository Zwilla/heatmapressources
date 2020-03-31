import { StandardEntity } from "./sys$StandardEntity";
import { DashboardGroup } from "./dashboard$DashboardGroup";
export class PersistentDashboard extends StandardEntity {
  static NAME = "dashboard$PersistentDashboard";
  dashboardModel?: string | null;
  name?: string | null;
  code?: string | null;
  group?: DashboardGroup | null;
  isAvailableForAllUsers?: boolean | null;
}
export type PersistentDashboardViewName =
  | "_minimal"
  | "_local"
  | "_base"
  | "dashboard-group-view"
  | "dashboard-browse";
export type PersistentDashboardView<
  V extends PersistentDashboardViewName
> = V extends "_minimal"
  ? Pick<PersistentDashboard, "id" | "name" | "code">
  : V extends "_local"
  ? Pick<
      PersistentDashboard,
      "id" | "dashboardModel" | "name" | "code" | "isAvailableForAllUsers"
    >
  : V extends "_base"
  ? Pick<
      PersistentDashboard,
      "id" | "name" | "code" | "dashboardModel" | "isAvailableForAllUsers"
    >
  : V extends "dashboard-group-view"
  ? Pick<
      PersistentDashboard,
      | "id"
      | "version"
      | "createTs"
      | "createdBy"
      | "updateTs"
      | "updatedBy"
      | "deleteTs"
      | "deletedBy"
      | "dashboardModel"
      | "name"
      | "code"
      | "isAvailableForAllUsers"
      | "group"
    >
  : V extends "dashboard-browse"
  ? Pick<
      PersistentDashboard,
      | "id"
      | "version"
      | "createTs"
      | "createdBy"
      | "updateTs"
      | "updatedBy"
      | "deleteTs"
      | "deletedBy"
      | "name"
      | "code"
      | "isAvailableForAllUsers"
      | "group"
    >
  : never;

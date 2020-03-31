import { StandardEntity } from "./base/sys$StandardEntity";
export class UserRights extends StandardEntity {
  static NAME = "heatmapressources_UserRights";
  userRights_TypeName?: string | null;
  description?: string | null;
}
export type UserRightsViewName = "_minimal" | "_local" | "_base";
export type UserRightsView<V extends UserRightsViewName> = V extends "_minimal"
  ? Pick<UserRights, "id" | "description">
  : V extends "_local"
  ? Pick<UserRights, "id" | "userRights_TypeName" | "description">
  : V extends "_base"
  ? Pick<UserRights, "id" | "description" | "userRights_TypeName">
  : never;

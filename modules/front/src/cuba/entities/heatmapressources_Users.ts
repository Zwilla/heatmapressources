import { StandardEntity } from "./base/sys$StandardEntity";
export class Users extends StandardEntity {
  static NAME = "heatmapressources_Users";
  firstName?: string | null;
  lastName?: string | null;
  email?: string | null;
  userRights_Group?: string | null;
  userRights_Role?: string | null;
  userRights_Substitution?: string | null;
}
export type UsersViewName = "_minimal" | "_local" | "_base";
export type UsersView<V extends UsersViewName> = V extends "_minimal"
  ? Pick<Users, "id" | "firstName" | "lastName">
  : V extends "_local"
  ? Pick<
      Users,
      | "id"
      | "firstName"
      | "lastName"
      | "email"
      | "userRights_Group"
      | "userRights_Role"
      | "userRights_Substitution"
    >
  : V extends "_base"
  ? Pick<
      Users,
      | "id"
      | "firstName"
      | "lastName"
      | "email"
      | "userRights_Group"
      | "userRights_Role"
      | "userRights_Substitution"
    >
  : never;

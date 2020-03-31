import { StandardEntity } from "./sys$StandardEntity";
import { User } from "./sec$User";
import { Role } from "./sec$Role";
export class UserRole extends StandardEntity {
  static NAME = "sec$UserRole";
  user?: User | null;
  role?: Role | null;
  roleName?: string | null;
}
export type UserRoleViewName =
  | "_minimal"
  | "_local"
  | "_base"
  | "user.edit"
  | "tmp.user.edit";
export type UserRoleView<V extends UserRoleViewName> = V extends "_local"
  ? Pick<UserRole, "id" | "roleName">
  : V extends "_base"
  ? Pick<UserRole, "id" | "roleName">
  : V extends "user.edit"
  ? Pick<UserRole, "id" | "role" | "roleName">
  : V extends "tmp.user.edit"
  ? Pick<UserRole, "id" | "user" | "role">
  : never;

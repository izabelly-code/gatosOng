import Card from "../../Components/Layout/Card"
import { GoGear } from "react-icons/go";
import Button from "../../Components/Layout/Button";

interface UserListProps {
    nome: string,
    email: string,
    cargo: string[]
}


export const UserList = ({ nome, email, cargo }: UserListProps) => {

    return (
        <tr className="border-b-1 border-gray-100">
            <td className="py-[10px]">
                <div className="px-[10px]">{nome}</div>
            </td>
            <td className="py-[10px]">
                <div className="px-[10px]">{email}</div>

            </td>
            <td className="py-[10px]">
                <div className="flex flex-wrap gap-2 px-[10px]">
                    {cargo.map((c) => (
                        <p className={`rounded-full py-1 px-4 ${c == "user" ? "bg-slate-200" : c == "adm" ? "bg-lime-200" : ""}`} >{c}</p>
                    ))}
                </div>
            </td>

            <td>
                <div>
                <Button order="secondary" text="Gerenciar Cargo"></Button>
                </div>
            </td>
        </tr>
    )
}


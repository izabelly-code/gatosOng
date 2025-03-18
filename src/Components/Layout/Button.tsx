interface Button {
    order: string
    text: String
    action: () => void
}

function Button({order, text, action}: Button) {

    // const buttonClass = order == "primary" ? "bg-sky-400" : order == "secondary" ? ""

    return(
        <button className={`button inline-flex justify-center items-center button rounded py-2 px-4 cursor-pointer ${order == "primary" ? "bg-sky-400 hover:bg-sky-500" : "border-1 hover:bg-slate-50"}`} onClick={action}>
            {text}
        </button>
    )
}

export default Button
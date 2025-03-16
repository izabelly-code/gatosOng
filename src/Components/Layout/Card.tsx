interface CardProps {
    className?: string
    children: React.ReactNode
}

function Card({className, children}: CardProps) {
    return(
        <div className={`min-w-[400px] rounded overflow-hidden shadow-lg border-1 border-slate-50 p-4 ${className ? className : ``}`}>
            {children}
        </div>
    )
}

export default Card